package jp.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.test.demo.model.ProductMaster;
import jp.test.demo.service.ProductService;

@Controller
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getProductList(Model model, @PageableDefault Pageable pageable) {
		Page<ProductMaster> productsPage = productService.findAll(pageable);
		model.addAttribute("page", productsPage);
		model.addAttribute("words", productsPage.getContent());
		model.addAttribute("url", "list");
		return "product/list";
	}
}
