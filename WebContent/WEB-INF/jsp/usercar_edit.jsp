<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Forms</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Modern Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="${pageContext.request.contextPath }/css/style.css" rel='stylesheet' type='text/css' />
<link href="${pageContext.request.contextPath }/css/font-awesome.css" rel="stylesheet"> 
<!-- jQuery -->
<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
<!----webfonts--->

<!---//webfonts--->  
<!-- Bootstrap Core JavaScript -->
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>

</script>
</head>
<body>
<div id="wrapper">
     <!-- Navigation -->
        <nav class="top1 navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">Modern</a>
            </div>
            <!-- /.navbar-header -->
            <ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
	        		<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-comments-o"></i><span class="badge">4</span></a>
	        		<ul class="dropdown-menu">
						<li class="dropdown-menu-header">
							<strong>Messages</strong>
							<div class="progress thin">
							  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
							    <span class="sr-only">40% Complete (success)</span>
							  </div>
							</div>
						</li>
						<li class="avatar">
							<a href="#">
								<img src="images/1.png" alt=""/>
								<div>New message</div>
								<small>1 minute ago</small>
								<span class="label label-info">NEW</span>
							</a>
						</li>
						<li class="avatar">
							<a href="#">
								<img src="images/2.png" alt=""/>
								<div>New message</div>
								<small>1 minute ago</small>
								<span class="label label-info">NEW</span>
							</a>
						</li>
						<li class="avatar">
							<a href="#">
								<img src="images/3.png" alt=""/>
								<div>New message</div>
								<small>1 minute ago</small>
							</a>
						</li>
						<li class="avatar">
							<a href="#">
								<img src="images/4.png" alt=""/>
								<div>New message</div>
								<small>1 minute ago</small>
							</a>
						</li>
						<li class="avatar">
							<a href="#">
								<img src="images/5.png" alt=""/>
								<div>New message</div>
								<small>1 minute ago</small>
							</a>
						</li>
						<li class="avatar">
							<a href="#">
								<img src="images/pic1.png" alt=""/>
								<div>New message</div>
								<small>1 minute ago</small>
							</a>
						</li>
						<li class="dropdown-menu-footer text-center">
							<a href="#">View all messages</a>
						</li>	
	        		</ul>
	      		</li>
			    <li class="dropdown">
	        		<a href="#" class="dropdown-toggle avatar" data-toggle="dropdown"><img src="images/1.png" alt=""/><span class="badge">9</span></a>
	        		<ul class="dropdown-menu">
						<li class="dropdown-menu-header text-center">
							<strong>Account</strong>
						</li>
						<li class="m_2"><a href="#"><i class="fa fa-bell-o"></i> Updates <span class="label label-info">42</span></a></li>
						<li class="m_2"><a href="#"><i class="fa fa-envelope-o"></i> Messages <span class="label label-success">42</span></a></li>
						<li class="m_2"><a href="#"><i class="fa fa-tasks"></i> Tasks <span class="label label-danger">42</span></a></li>
						<li><a href="#"><i class="fa fa-comments"></i> Comments <span class="label label-warning">42</span></a></li>
						<li class="dropdown-menu-header text-center">
							<strong>Settings</strong>
						</li>
						<li class="m_2"><a href="#"><i class="fa fa-user"></i> Profile</a></li>
						<li class="m_2"><a href="#"><i class="fa fa-wrench"></i> Settings</a></li>
						<li class="m_2"><a href="#"><i class="fa fa-usd"></i> Payments <span class="label label-default">42</span></a></li>
						<li class="m_2"><a href="#"><i class="fa fa-file"></i> Projects <span class="label label-primary">42</span></a></li>
						<li class="divider"></li>
						<li class="m_2"><a href="#"><i class="fa fa-shield"></i> Lock Profile</a></li>
						<li class="m_2"><a href="#"><i class="fa fa-lock"></i> Logout</a></li>	
	        		</ul>
	      		</li>
			</ul>
			<form class="navbar-form navbar-right">
              <input type="text" class="form-control" value="Search..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search...';}">
            </form>
            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li>
                            <a href="${pageContext.request.contextPath }/dtc/queryDtcByDcodePage.action?pc=1"><i class="fa fa-dashboard fa-fw nav_icon"></i>故障码管理</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath }/user/queryUserByUnamePage.action"><i class="fa fa-laptop nav_icon"></i>用户管理</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath }/car/queryCarByUserPage.action"><i class="fa fa-indent nav_icon"></i>车辆管理</a>
                        </li>
                       
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>
        <div id="page-wrapper">
        <div class="graphs">
	     <div class="xs">
  	       <h3>Forms</h3>
  	         <div class="tab-content">
  	        	<c:if test="${error!=null }">
					${ error}<br/>
				</c:if>
						<div class="tab-pane active" id="horizontal-form">
							<form class="form-horizontal" action="${pageContext.request.contextPath }/user/editUserCarSubmit.action" method="post">
							 <c:if test="${(userCustom.custom)!= null && fn:length(userCustom.custom) > 0}">
								<c:forEach begin="${index }" end="${index }" items="${userCustom.custom }" var="car">
								<input type="hidden" name="uid" value="${userCustom.uid }">
								<input type="hidden" name="custom[${index }].cid" value="${car.cid }">
								<input type="hidden" name="custom[${index }].cuid" value="${car.cuid }">
								
								<div class="form-group">
									<label for="focusedinput" class="col-sm-2 control-label">用户名</label>
									<div class="col-sm-8">
										<input name="uname" type="text" class="form-control1" id="focusedinput" value="${userCustom.uname }">
									</div>
								</div>
								<div class="form-group">
									<label for="disabledinput" class="col-sm-2 control-label">用户密码</label>
									<div class="col-sm-8">
										<input name="upassword" type="text" class="form-control1" id="disabledinput" value="${userCustom.upassword }">
									</div>
								</div>
								<div class="form-group">
									<label for="disabledinput" class="col-sm-2 control-label">车辆名</label>
									<div class="col-sm-8">
										<input name="custom[${index }].cname" type="text" class="form-control1" id="disabledinput" value="${car.cname }">
									</div>
								</div>
								<div class="form-group">
									<label for="inputPassword" class="col-sm-2 control-label">车辆品牌</label>
									<div class="col-sm-8">
										<input name="custom[${index }].ctype" type="text" class="form-control1" id="inputPassword" value="${car.ctype }">
									</div>
								</div>
								<div class="form-group">
									<label for="inputPassword" class="col-sm-2 control-label">出厂时间</label>
									<div class="col-sm-8">
										<input name="custom[${index }].cproduct" type="text" class="form-control1" id="inputPassword" value="${car.cproduct }">
									</div>
								</div>
								<div class="form-group">
									<label for="inputPassword" class="col-sm-2 control-label">排量</label>
									<div class="col-sm-8">
										<input size="20" name="custom[${index }].cdisplacement" type="text" class="form-control1" id="inputPassword" value="${car.cdisplacement }">
									</div>
								</div>
								<div class="panel-footer">
								<div class="row">
									<div class="col-sm-8 col-sm-offset-2">
										<input type="submit" class="btn btn-primary" value="提交">
              							<input type="button"  class="btn btn-default" value="返回" onclick="javascript:window.location.href='${pageContext.request.contextPath}/user/findUserCar.action'"/>
									</div>
								</div>
								</div>
								</c:forEach>
								</c:if>
								 <c:if test="${(userCustom.custom)!= null && fn:length(userCustom.custom) <= 0}">
								 <input type="hidden" name="uid" value="${userCustom.uid }">
								
								<div class="form-group">
									<label for="focusedinput" class="col-sm-2 control-label">用户名</label>
									<div class="col-sm-8">
										<input name="uname" type="text" class="form-control1" id="focusedinput" value="${userCustom.uname }">
									</div>
								</div>
								<div class="form-group">
									<label for="disabledinput" class="col-sm-2 control-label">用户密码</label>
									<div class="col-sm-8">
										<input name="upassword" type="text" class="form-control1" id="disabledinput" value="${userCustom.upassword }">
									</div>
								</div>
								<div class="form-group">
									<label for="disabledinput" class="col-sm-2 control-label">车辆名</label>
									<div class="col-sm-8">
										<input name="custom[${index }].cname" type="text" class="form-control1" id="disabledinput" value="">
									</div>
								</div>
								<div class="form-group">
									<label for="inputPassword" class="col-sm-2 control-label">车辆品牌</label>
									<div class="col-sm-8">
										<input name="custom[${index }].ctype" type="text" class="form-control1" id="inputPassword" value="">
									</div>
								</div>
								<div class="form-group">
									<label for="inputPassword" class="col-sm-2 control-label">出厂时间</label>
									<div class="col-sm-8">
										<input name="custom[${index }].cproduct" type="text" class="form-control1" id="inputPassword" value="">
									</div>
								</div>
								<div class="form-group">
									<label for="inputPassword" class="col-sm-2 control-label">排量</label>
									<div class="col-sm-8">
										<input size="20" name="custom[${index }].cdisplacement" type="text" class="form-control1" id="inputPassword" value="">
									</div>
								</div>
								<div class="panel-footer">
								<div class="row">
									<div class="col-sm-8 col-sm-offset-2">
										<input type="submit" class="btn btn-primary" value="提交">
              							<input type="button"  class="btn btn-default" value="返回" onclick="javascript:window.location.href='${pageContext.request.contextPath}/user/findUserCar.action'"/>
									</div>
								</div>
								</div>
								 </c:if>
							 </form>
						</div>
					</div>
  </div>
  
  </div>
      </div>
      <!-- /#page-wrapper -->
   </div>
    <!-- /#wrapper -->
<!-- Nav CSS -->
<link href="${pageContext.request.contextPath }/css/custom.css" rel="stylesheet">
<!-- Metis Menu Plugin JavaScript -->
<script src="${pageContext.request.contextPath }/js/metisMenu.min.js"></script>
<script src="${pageContext.request.contextPath }/js/custom.js"></script>
</body>
</html>
