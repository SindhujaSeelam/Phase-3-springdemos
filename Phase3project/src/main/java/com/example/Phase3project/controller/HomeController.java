package com.example.Phase3project.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Phase3project.entity.admin;
import com.example.Phase3project.entity.product;
import com.example.Phase3project.entity.purchase;
import com.example.Phase3project.entity.user;
import com.example.Phase3project.repository.AdminRepository;
import com.example.Phase3project.repository.ProductRepository;
import com.example.Phase3project.repository.PurchaseRepository;
import com.example.Phase3project.repository.UserRepository;

@Controller

public class HomeController {

	@Autowired
	private UserRepository up;
	@Autowired
	private ProductRepository rp;

	@Autowired
	private PurchaseRepository pr;

	@Autowired
	private AdminRepository ap;

	@GetMapping("/home")
	public String login() {

		return "home";

	}

	@GetMapping("/admin")
	public String admnpage() {

		return "adminlogin";

	}

	@GetMapping("/adminback")
	public String adminback() {

		return "admincheck";

	}

	@GetMapping("/admincheck")
	public String admnpagecheck(ModelMap map, @ModelAttribute("username") String username,
			@ModelAttribute("password") String password) {

		admin a = ap.findAllByUsername(username);

		if (username.equals(a.getUsername()) && password.equals(a.getPassword())) {
			map.addAttribute(username);
			map.addAttribute(password);
			return "admincheck";
		} else {
			String msg = "Invalid username and password<br> Login again";
			map.addAttribute("msg", msg);
			return "adminlogin";
		}

	}

	@GetMapping("/changepassword")
	public String admnchangepswpage(ModelMap map, @ModelAttribute("username") String username) {
		map.addAttribute(username);
		return "adminchangepwd";

	}

	@GetMapping("/databasechangepwd")
	public String databasechangepwd(ModelMap map, @ModelAttribute("changepwd") String newpwd) {
		admin a = ap.findAllByUsername("Sindhuja");
		a.setPassword(newpwd);
		ap.save(a);
		map.addAttribute("changemsg", "Password Changed Successfully<br>Login again to continue");
		return "adminlogin";

	}

	@GetMapping("/userslist")
	public String userslist(ModelMap map) {

		Iterable<user> u = up.findAll();
		map.addAttribute("users", u);
		map.addAttribute("values", true);

		return "userlist";

	}

	@GetMapping("/searchuser")
	public String searchuser(ModelMap map, @ModelAttribute("suser") String suser) {

		Iterable<user> u = up.findByName(suser);
		if (StreamSupport.stream(u.spliterator(), false).count() != 0) {
			System.out.println(u.getClass().getName());
			map.addAttribute("users", u);
			map.addAttribute("values", true);
		} else {
			map.addAttribute("msg", "No users are available with the entered name");
		}

		return "userlist";

	}

	@GetMapping("/productslist")
	public String productslist(ModelMap map, @ModelAttribute("suser") String suser) {

		map.addAttribute("products", rp.findAll());
		return "productslist";

	}

	@GetMapping("/userlogin")
	public String userlogin() {

		return "userlogin";

	}

	@GetMapping("/usercheck")
	public String usercheck(ModelMap map, @ModelAttribute("email") String cemail,
			@ModelAttribute("password") String cpassword) {

		user u = up.findByEmail(cemail);
		if (u != null) {
			if (u.getEmail().equals(cemail) && u.getPassword().equals(cpassword)) {
				map.addAttribute("uid", u.getId());
				map.addAttribute("products", rp.findAll());
				return "display";

			}
		} else {
			map.addAttribute("loginmsg", "Invalid email and password<br>Try again");
			return "userlogin";
		}
		return "userlogin";

	}

	@GetMapping("/userreg")
	public String userregpage() {

		return "userreg";

	}

	@PostMapping("/userinsert")
	public String userinsert(ModelMap map, @ModelAttribute("usser") user u) {

		up.save(u);
		String regmsg = "Registered Successfully!!!<br>Login to Continue";
		map.addAttribute("regmsg", regmsg);
		return "userlogin";

	}

	@PostMapping("/detailedproduct")
	public String bookpage(ModelMap map, @ModelAttribute("uid") int uid, @ModelAttribute("pid") int pid,
			@ModelAttribute("price") int price) {

		map.addAttribute("uid", uid);
		map.addAttribute("pid", pid);
		map.addAttribute("sp", rp.findById(pid).get());

		map.addAttribute("price", price);

		return "bookproduct";

	}

	@GetMapping("/payment")
	public String paymentpage(ModelMap map, @ModelAttribute("uid") int uid, @ModelAttribute("pid") int pid,
			@ModelAttribute("price") int price) {

		map.addAttribute("uid", uid);
		map.addAttribute("pid", pid);
		map.addAttribute("price", price);
		return "paymentpage";

	}

	@GetMapping("/confirmation")
	public String confirmationpage(ModelMap map, @ModelAttribute("uid") int uid, @ModelAttribute("pid") int pid,
			@ModelAttribute("price") int price) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		map.addAttribute("uid", uid);
		map.addAttribute("pid", pid);
		map.addAttribute("price", price);
		map.addAttribute("user", up.findById(uid).get());
		map.addAttribute("product", rp.findById(pid).get());
		purchase pu = new purchase();
		user u = up.findById(uid).get();
		product product = rp.findById(pid).get();
		pu.setCategory(product.getCategory());
		pu.setDate(dtf.format(now));
		pu.setEmail(u.getEmail());
		pu.setName(u.getName());
		pu.setPrice(product.getPrice());
		pr.save(pu);
		return "confirmationpage";

	}

	@GetMapping("/purchase")
	public String purchase(ModelMap map) {

		Iterable<com.example.Phase3project.entity.purchase> sys = pr.findAll();
		System.out.println(sys);
		map.addAttribute("purchase", pr.findAll());

		map.addAttribute("values", true);
		map.addAttribute("msg", " ");
		return "purchasereport";

	}

	@GetMapping("/sppurchase")
	public String sppurchase(ModelMap map, @ModelAttribute("category") String category,
			@ModelAttribute("date") String date) {

		Iterable<purchase> items = pr.findByCategoryAndDate(category, date);
		System.out.println();
		if (StreamSupport.stream(items.spliterator(), false).count() != 0) {
			System.out.println(items.getClass().getName());
			map.addAttribute("purchase", items);
			map.addAttribute("values", true);
		} else {
			map.addAttribute("msg", "No Reports are available");
		}

		return "purchasereport";

	}

	@GetMapping("/searchmore")
	public String searchmore(ModelMap map, @ModelAttribute("uid") int uid) {

		map.addAttribute("uid", uid);
		map.addAttribute("products", rp.findAll());

		return "display";

	}

	@GetMapping("/addproduct")
	public String adproduct(ModelMap map) {

		return "addproduct";

	}

	@GetMapping("/insertproduct")
	public String insertproduct(ModelMap map, @ModelAttribute("category") String cat,
			@ModelAttribute("price") int price, @ModelAttribute("brandname") String bn,
			@ModelAttribute("color") String color, @ModelAttribute("mt") String mt) {

		product p = new product();
		p.setBrandname(bn);
		p.setCategory(cat);
		p.setColor(color);
		p.setMaterialtype(mt);
		p.setPrice(price);
		rp.save(p);
		map.addAttribute("msg", "Product inserted");
		return "insertproduct";

	}

}