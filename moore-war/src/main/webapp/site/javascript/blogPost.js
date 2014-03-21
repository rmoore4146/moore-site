$(function () {
    blogPost.initEvents();
});

var blogPost = {

    initEvents: function() {

        $('.container').delegate('.btn', "click", function() {
            blogPost.createBlogPost();
        });
    },

    createBlogPost: function() {

        var data = $('#blogPostForm').serialize();
        $.ajax({
            url: "createPost",
            type: "POST",
            data: data,
            dataType: 'html',
            success: function(result) {
                $('.bodyContainer .jumbotron').prepend($(result));
                common.postToForm("blog");
            },
            error: function(result) {
                $('.bodyContainer .jumbotron').prepend($(result));
            }
        });
    }
};