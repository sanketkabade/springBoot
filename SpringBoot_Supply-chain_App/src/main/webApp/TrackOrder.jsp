
<%@include file="header.jsp"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.List"%>
<%@page import="com.seed.CustomerRegistration"%>
<%@page import="com.seed.Orders"%>
<html xmlns:th="http://www.thymeleaf.org">

<style>
table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #f2f2f2
}

th {
	background-color: #04AA6D;
	color: white;
}
</style>
<div>
	<h2></h2>
	<%
	int srNo = 0;
	List<Orders> li = (List) request.getAttribute("pl");
	List<CustomerRegistration> li2 = (List) request.getAttribute("cl");
	%>

	<table>
		<tr>
			<td>Sr.No</td>
			<td>Date</td>
			<td>Customer Details</td>
			<td>Product Ordered</td>
			<td>Quantity</td>
			<td>Delivery Address</td>
			<td>Accept Order</td>
			<td>Date Assigned</td>
		</tr>
		<tr>
			<%
			int srno = 0;
			for (Orders p : li) {
				for (CustomerRegistration c : li2) {
			%>

			<td><%=++srno%></td>
			<td><%=LocalDate.now()%></td>
			<td><%=c.getContactPerson()%></td>
			<td><%=p.getProdName()%></td>
			<td><%=p.getProdQntity()%></td>
			<td><%=p.getDeleveryAddress()%></td>
			<td><input type="checkbox" checked></td>
			<td><%=LocalDate.now()%></td>
		</tr>

		<%
		}

		}
		%>
	</table>
</div>

<%@include file="footer.jsp"%>