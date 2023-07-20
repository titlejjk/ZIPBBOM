<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/index.css">

</head>
<body>
    <div class="wrapper">
        <header>
            <nav class="navbar">
                <div id="top-logo">
                    <img src="${pageContext.request.contextPath }/resources/common/images/top-logo.png" alt="" />
                </div>

                <ul class="navbar-menu">                   
                    <li><a href="${pageContext.request.contextPath }/members/login_form">로그인</a></li>
                    <li>랜선집들이</li>
                    <li>마이페이지</li>                    
                </ul>
            </nav>
        </header>

        <main>
            <div class="main-section">
                <div class="main-img">
                    <img src="${pageContext.request.contextPath }/resources/common/images/room03.jpg" alt="">                    
                </div>
                <div class="main-box">
                    <div class="main-title">
                        <h1>오늘 너네 집에서 파티할건데 너도 올래?</h1>
                    <p>당신의 집을 소개해주세요!!</p>
                    </div>
                    
                    <button type="button" id="loginBtn">놀러가기</button>
                </div>
            
            </div>
        </main>

        <section class="section section1">
            <div class="section-title">
                <p>Today's best Room</p>
            </div>
            <div class="best-content">
                <ul>
                    <li class="best-context-box">best-content<img src="${pageContext.request.contextPath }/resources/common/images/room01.jpg" alt=""></li>
                    <li class="best-context-box">best-content<img src="${pageContext.request.contextPath }/resources/common/images/room01.jpg" alt=""></li>
                    <li class="best-context-box">best-content<img src="${pageContext.request.contextPath }/resources/common/images/room01.jpg" alt=""></li>
                    <li class="best-context-box">best-content<img src="${pageContext.request.contextPath }/resources/common/images/room01.jpg" alt=""></li>
                </ul>
            </div>
        </section>
        <section class="section section2">
            <div class="section-title">
                <p>당신의 이야기를 들려주세요</p>
            </div>
            <div class="content-box">
                <div class="content-img">
                    <img src="" alt="">
                </div>
                <div class="content-desc">

                </div>
            </div>
        </section>
        <section class="section section3">

        </section>

        <footer>
            <div class="inner">
                <div class="contactUs">
                    <form action="MAILTO:katejo6011@gmail.com">
                        <input type="text" name="name" placeholder="name" autocomplete="off">
                        <input type="text" name="title" placeholder="title" autocomplete="off">
                        <input type="text" name="email" placeholder="email" autocomplete="off">
                        <textarea name="content" id="contact-content" cols="30" rows="10"></textarea>
                    </form>
                </div>
            </div>
        </footer>
    </div>
</body>
</html>