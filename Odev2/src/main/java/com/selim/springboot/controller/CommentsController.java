package com.selim.springboot.controller;

import com.selim.springboot.core.Result;
import com.selim.springboot.dao.ProductCommentDao;
import com.selim.springboot.dto.CommentInsertDto;
import com.selim.springboot.service.entityservice.ProductCommentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productComments")
public class CommentsController {

    @Autowired
    private ProductCommentEntityService productCommentEntityService;


    @GetMapping("")
    private Result getByUserId(@RequestParam long userId){
        return this.productCommentEntityService.getByUser_Id(userId);
    }

    @GetMapping("/products")
    private Result getByProductId(@RequestParam long productId){
        return this.productCommentEntityService.getByUrun_Id(productId);
    }

    @DeleteMapping("")
    private Result deleteByCommentId(@RequestParam long commentId){
        return  this.productCommentEntityService.deleteByComment_Id(commentId);
    }

    @PostMapping("")
    private Result addComment(@RequestBody CommentInsertDto commentInsertDto){
        return this.productCommentEntityService.insertComment(commentInsertDto);
    }

}
