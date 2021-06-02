package com.TechTalent.BlogOfTalentTech.Repository;

import com.TechTalent.BlogOfTalentTech.Model.BlogPost;
import org.springframework.data.repository.CrudRepository;

public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {
}
