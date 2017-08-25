<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Dtc_tables</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Modern Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/css/style.css" rel='stylesheet' type='text/css' />
<link href="${pageContext.request.contextPath}/css/font-awesome.css" rel="stylesheet"> 
<!-- jQuery -->
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<!----webfonts--->
<!-- <link href='http://fonts.useso.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'> -->
<!---//webfonts--->  
<!-- Bootstrap Core JavaScript -->
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script type="text/javascript">
function queryCarByCnamePage() {
	document.dtcForm.action="${pageContext.request.contextPath }/car/queryCarByCnamePage.action";
	document.dtcForm.submit();
}

function insertCar() {
	document.dtcForm.action="${pageContext.request.contextPath }/car/insertCar.action";
	document.dtcForm.submit();
}

function deleteCarList() {
	document.dtcForm.action="${pageContext.request.contextPath }/car/deleteCarList.action";
	document.dtcForm.submit();
}

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
                         <li>
                            <a href="${pageContext.request.contextPath }/user/findUserCar.action"><i class="fa fa-indent nav_icon"></i>车辆管理</a>
                        </li>
                       
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>
        <div id="page-wrapper">
        <div class="col-md-12 graphs">
	   <div class="xs">
  	 <h3>Basic Tables</h3>
  	
	<form name="dtcForm" action="${pageContext.request.contextPath }/car/queryCarByUserPage.action" method="post">
	
	<div class="bs-example4" data-example-id="simple-responsive-table">
   <div class="mail-toolbar clearfix">
   <div class="input-group">
     <input type="text" name="dtcCustom.dcode" class="form-control1 input-search" placeholder="故障码编号">
          <span class="input-group-btn">
             <button class="btn btn-success" type="button" onclick="queryDtcByDcodePage()"><i class="fa fa-search"></i></button>
          </span>
   </div><!-- Input Group -->
    	<div class="float-left">
			<button type="button" class="btn btn-sm btn-default" onclick="insertCar()">添加用户车辆 </button>
			<button type="button" class="btn btn-sm btn-default" onclick="deleteCarList()">批量删除</button>
		</div>
	</div><!--  /.table-responsive -->
    <div class="table-responsive">
      <table class="table table-bordered">
        <thead>
          <tr>
            <th>选择</th>
            <th>用户名</th>
            <th>用户车型</th>
            <th>品牌</th>
            <th>出厂时间</th>
            <th>排量</th>
            <th>操作</th>
          </tr>
        </thead>
        
       
        <tbody>
         <c:forEach items="${userCar }" var="item" >
          <tr>
            <td><input type="checkbox" name="car_id" value="${item.cid } "/></td>
            <td>${item.userCustom.uname }</td>
            <td>${item.cname }</td>
            <td>${item.ctype }</td>
            <td>${item.cproduct }</td>
            <td>${item.cdisplacement }</td>
            <td><a href="${pageContext.request.contextPath }/car/editCar.action?cid=${item.cid }">修改</a>
            <a href="${pageContext.request.contextPath }/car/deleteCar.action?cid=${item.cid }">删除</a>
            </td>
          </tr>
          </c:forEach>
         
        </tbody>
      </table>
      
    </div><!-- /.table-responsive -->
  </div>
</form>
  </div>
  <div class="copy_layout">
   <ul class="pagination">
    第${pb.pc } 页/共${pb.tp }页
  <li><a href="${pb.url }&pc=1">首页</a></li>
    	<c:if test="${pb.pc > 1 }">
    		<li><a href="${pb.url }&pc=${pb.pc-1}">上一页</a></li>
    	</c:if>
    	<c:choose>
    		<c:when test="${pb.tp <= 10 }">
    			<c:set var="begin" value="1"/>
    			<c:set var="end" value="${pb.tp }"/>
    		</c:when>
    		<c:otherwise>
    			<c:set var="begin" value="${pb.pc - 5 }"/>
    			<c:set var="end" value="${pb.pc + 4 }"/>
    			
    			<c:if test="${begin < 1 }">
    				<c:set var="begin" value="1"/>
    				<c:set var="end" value="10"/>
    			</c:if>
    			<c:if test="${end > pb.tp }">
    				<c:set var="begin" value="${pb.tp-9 }"/>
    				<c:set var="end" value="${pb.tp }"/>
    			</c:if>
    		</c:otherwise>
    	</c:choose>
    	
    	<c:forEach var="i" begin="${begin }" end="${end }">
    		<c:choose>
    			<c:when test="${pb.pc == i }">
    				<li class="active"><a href="${pb.url}&pc=${pb.pc}">${i }<span class="sr-only">(current)</span></a></li>
    			</c:when>
    			<c:otherwise>
    				<li><a href="${pb.url }&pc=${i}">${i }</a></li>
    			</c:otherwise>
    		</c:choose>
    		
    	</c:forEach>
    	
    	
    	<c:if test="${pb.pc < pb.tp }">
    		<li><a href="${pb.url }&pc=${pb.pc+1}">下一页</a></li>
    	</c:if>
    	<li><a href="${pb.url }&pc=${pb.tp}">尾页</a></li>
    	</ul>
     
  </div>
   </div>
      </div>
      <!-- /#page-wrapper -->
   </div>
    <!-- /#wrapper -->
<!-- Nav CSS -->
<link href="${pageContext.request.contextPath}/css/custom.css" rel="stylesheet">
<!-- Metis Menu Plugin JavaScript -->
<script src="${pageContext.request.contextPath}/js/metisMenu.min.js"></script>
<script src="${pageContext.request.contextPath}/js/custom.js"></script>
</body>
</html>
