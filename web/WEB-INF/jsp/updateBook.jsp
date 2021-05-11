
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--BootStrasp--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h1>修改书籍</h1>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updateBook" method="get">
        <%--前端传递隐藏域提交ID--%>
        <input type="hidden" name="bookID" value="${Qbooks.bookID}">
        <div class="form-group">
            <label >书籍名称:</label>
            <input type="text" name="bookName" value="${Qbooks.bookName}" class="form-control" required>
        </div>
        <div class="form-group">
            <label>书籍数量:</label>
            <input type="text" name="bookCounts" value="${Qbooks.bookCounts}" class="form-control" required>
        </div>
        <div class="form-group">
            <label>书籍描述:</label>
            <input type="text" name="detail" value="${Qbooks.detail}" class="form-control" required >
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改书籍">
        </div>
    </form>
</div>
</body>
</html>
