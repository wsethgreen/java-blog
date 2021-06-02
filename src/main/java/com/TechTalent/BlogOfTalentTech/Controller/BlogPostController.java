package com.TechTalent.BlogOfTalentTech.Controller;

import com.TechTalent.BlogOfTalentTech.Model.BlogPost;
import com.TechTalent.BlogOfTalentTech.Repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class BlogPostController {

    @Autowired
    private BlogPostRepository blogPostRepository;

    @GetMapping(value = "/")
    public String index(BlogPost blogPost) {
        return "blogPost/index";
    }

    private BlogPost blogPost;

    @PostMapping(value = "/")
    public String addNewBlogPost(BlogPost blogPost, Model model) {
        blogPostRepository.save(new BlogPost(blogPost.getTitle(), blogPost.getBlogEntry(), blogPost.getAuthor()));
        model.addAttribute("title", blogPost.getTitle());
        model.addAttribute("author", blogPost.getAuthor());
        model.addAttribute("blogEntry", blogPost.getBlogEntry());
        return "blogPost/result";
    }
}
