
<%@include file="header.jsp"%>

<div>
	<section class="vh-100 gradient-custom">
		<div class="container">
			<div class="row justify-content-center align-items-center ">
				<div class="col-12 col-lg-9 col-xl-7" style="margin: 10px">
					<div class="card shadow-2-strong card-registration"
						style="border-radius: 15px;">
						<div class="card-body p-4 p-md-5">
							<h3 class="mb-4 pb-2 pb-md-0 mb-md-5" style="text-align: center;">Place
								Order</h3>
							<form  action="orders" method="post">

								<div class="row">

									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<input type="text" id="productId" name="pId"
												class="form-control " /> <label class="form-label"
												for="productId">Product Id</label>
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<input type="text" id="ProductName" name="product"
												class="form-control " /> <label class="form-label"
												for="ProductName">Product Name</label>
										</div>

									</div>
								</div>
								<div class="row">

									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<input type="number" id="quntity" name="qnt"
												class="form-control " /> <label class="form-label"
												for="quntity">quntity</label>
										</div>

									</div>
									<div class="form-outline">
										<textarea type="text" id="Address" name="Address"class="form-control "
											rows="" cols=""></textarea>

										<label class="form-label" for="Address"> Deleavery
											Address</label>
									</div>
								</div>

								<div class=" row">
									<div class="col-md-6 mb-4">
										<div class="mt-4 pt-2 col-6">
											<input class="btn btn-primary btn-lg" type="submit"
												value="Submit" />
										</div>
									</div>
									<div class="col-md-6 mb-4">
										<div class="mt-4 pt-2 col-6">
											<input class="btn btn-primary btn-lg" type="submit"
												value="Submit" />
										</div>
									</div>
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