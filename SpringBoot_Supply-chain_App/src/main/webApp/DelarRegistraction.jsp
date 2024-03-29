<%@include file="header.jsp"%>

<div>
	<section class="vh-100 gradient-custom">
		<div class="container">
			<div class="row justify-content-center align-items-center ">
				<div class="col-12 col-lg-9 col-xl-7" style="margin: 10px">
					<div class="card shadow-2-strong card-registration"
						style="border-radius: 15px;">
						<div class="card-body p-4 p-md-5">
							<h3 class="mb-4 pb-2 pb-md-0 mb-md-5" style="text-align: center;">Dealer
								Registration form</h3>
							<form   action="delarRegistration" method="get" >

								<div class="row">
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<input type="text" name="orgName" id="firstName" class="form-control " /> <label
												class="form-label" for="firstName">Organization Name</label>
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<input type="text" id="lastName"  name="perName" class="form-control " /> <label
												class="form-label" for="lastName">Person Name</label>
										</div>

									</div>
								</div>
								<div class="row">
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<input type="number" id="firstName" name="conPerson" class="form-control " /> <label
												class="form-label" for="firstName">Contact Person</label>
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<input type="text" id="lastName" name="oEmail" class="form-control " /> <label
												class="form-label" for="lastName">Official Email</label>
										</div>

									</div>
								</div>

								
								<div class="row">
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<input type="text" id="firstName"  name="address"class="form-control " /> <label
												class="form-label" for="firstName">Address
												(warehouse)</label>
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<input type="text" id="lastName" name="officeAddress"class="form-control" /> <label
												class="form-label" for="lastName">Address (Office)</label>
										</div>

									</div>
								</div>




								<div class="mt-4 pt-2">
									<input class="btn btn-primary btn-lg" type="submit"
										value="Submit" />
								</div>
								
								

							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>
<%@include file="footer.jsp"%>