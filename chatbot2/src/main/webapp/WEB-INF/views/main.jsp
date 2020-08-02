<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="${pageContext.request.contextPath}/resources/js/jquery-3.4.1.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
   <script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
    <title>spring chat bot</title>
</head>
<body>

  <div class="container">
  <c:forEach items="${list}" var="member">
    <div class="row">
        <div class="col-md-3">${member.text}</div>
    </div>
    </c:forEach>
    <div class="roww">
        <div class="coll-md-3">hi2</div>
    </div>
  <div class="footer">
      <div class="footer_layout">
          <form action="insert" name="ajForm">
          		<input type="hidden" value="sanghoon" name="name">
                <textarea name="text" id="text" cols="30" rows="10"></textarea>
                <input type="submit" name="sub">
            </form>
      </div>
    </div>

         </div>
   
</body>
</html>