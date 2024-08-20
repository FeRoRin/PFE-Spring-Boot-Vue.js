<template>
  <div>
    <header class="py-5">
      <div class="container px-lg-5">
        <div class="p-4 p-lg-5 bg-light rounded-3 text-center">
          <div class="m-4 m-lg-5">
            <h1 class="display-5 fw-bold">welcome!</h1>
            <p class="fs-4">This website stands out for its products, services, and a wide range of offerings. </p>
            <router-link class="btn btn-primary btn-lg" to="/products">See all products</router-link>
          </div>
        </div>
      </div>
    </header>
    <section class="pt-4">
      <div class="container px-lg-5">
        <!-- Page Features-->
        <div class="row gx-lg-5">
          <div class="col-lg-6 col-xxl-6 mb-5">
            <div class="card bg-light border-0 h-100">
              <div class="card-body text-center p-4 p-lg-5 pt-0 pt-lg-0">
                <div class="feature bg-primary bg-gradient text-white rounded-3 mb-4 mt-n4"><i class="bi bi-collection"></i></div>
                <h2 class="fs-4 fw-bold">CLINET</h2>
                <a class="btn btn-primary btn-lg  px-5 me-sm-3 fs-6 " href="#!">Log in</a>
                <a class="btn btn-info btn-lg px-5 me-sm-3 fs-6 " href="#!">sing up</a>
              </div>
            </div>
          </div>
          <div class="col-lg-6 col-xxl-6 mb-5">
            <div class="card bg-light border-0 h-100">
              <div class="card-body text-center p-4 p-lg-5 pt-0 pt-lg-0">
                <div class="feature bg-primary bg-gradient text-white rounded-3 mb-4 mt-n4"><i class="bi bi-cloud-download"></i></div>
                <h2 class="fs-4 fw-bold">FOURNISEUR</h2>
                <a class="btn btn-primary btn-lg px-5  me-sm-3 fs-6 " href="#!">Log in</a>
                <a class="btn btn-info btn-lg px-5  me-sm-3 fs-6 " href="#!">sing up</a>
              </div>
            </div>
          </div>

        </div>
      </div>
    </section>
  </div>
</template>

<script>
export default {
  name: "About-page",
  // You can add component logic here
};
</script>
<style>


</style>
