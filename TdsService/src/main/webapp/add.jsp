<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title data-i18n-text="title">淘大师</title>
<meta name="viewport" content="initial-scale=1, maximum-scale=1">
<link type="text/css" rel="stylesheet" href="/dist/bootstrap/css/bootstrap.css">
<style>
.form-signin {
    max-width: 330px;
    padding: 15px;
    margin: 0 auto;
}
</style>
</head>
<body>
	<div class="container">
		<form class="form-signin" method="post" action="/exchange/insertExchange.atc">
			<h2 class="form-signin-heading">添 加</h2>
			<label for="inputEmail" class="sr-only">旺旺号</label> 
			<input type="text" name="exchange.wangwang" class="form-control" placeholder="旺旺号" required="" autofocus=""> 
			<label for="inputPassword" class="sr-only">店铺名</label> 
			<input type="text" name="exchange.shopName" class="form-control" placeholder="店铺名" required="">
			<label for="inputPassword" class="sr-only">产品</label> 
			<input type="text" name="exchange.product" class="form-control" placeholder="产品" required="">
			<button class="btn btn-lg btn-primary btn-block" type="submit">提 交</button>
		</form>
	</div>
</body>
</html>
