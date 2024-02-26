<%@include file="header.jsp"%>

<div class="container" >
   <h1 style="margin-top: 66px; margin-bottom: 31px;"> All Login Pages</h1>
	<div class="row">
		<div class="col">
			<form>
				<h2>Admin Login</h2>
				<div class="mb-3">
					<label for="exampleInputEmail1" class="form-label">Email
						address</label> <input type="email" class="form-control"
						id="exampleInputEmail1" aria-describedby="emailHelp">

				</div>
				<div class="mb-3">
					<label for="exampleInputPassword1" class="form-label">Password</label>
					<input type="password" class="form-control"
						id="exampleInputPassword1">
				</div>

				<button type="submit" class="btn btn-primary">Submit</button>
			</form>

		</div>
		<div class="col">
			<form>
				<h2>Dealer Login</h2>
				<div class="mb-3">
					<label for="exampleInputEmail1" class="form-label">Email
						address</label> <input type="email" class="form-control"
						id="exampleInputEmail1" aria-describedby="emailHelp">
					<div id="emailHelp" class="form-text"></div>
				</div>
				<div class="mb-3">
					<label for="exampleInputPassword1" class="form-label">Password</label>
					<input type="password" class="form-control"
						id="exampleInputPassword1">
				</div>

				<button type="submit" class="btn btn-primary">Submit</button>
			</form>

		</div>
		<div class="col">
			<form>
				<div class="mb-3">
					<h2>Customer Login</h2>
					<label for="exampleInputEmail1" class="form-label">Email
						address</label> <input type="email" class="form-control"
						id="exampleInputEmail1" aria-describedby="emailHelp">

				</div>
				<div class="mb-3">
					<label for="exampleInputPassword1" class="form-label">Password</label>
					<input type="password" class="form-control"
						id="exampleInputPassword1">
				</div>

				<button type="submit" class="btn btn-primary">Submit</button>
			</form>

		</div>
	</div>
</div>




<%@include file="footer.jsp"%>