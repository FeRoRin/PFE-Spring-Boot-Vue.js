import { createApp } from 'vue';
import App from './App.vue'; // Import your root Vue component
import { createRouter, createWebHistory } from 'vue-router'; // Import Vue Router
import Home from './components/Home.vue'; // Import your Home component
import About from './components/About.vue'; // Import your About component
import axios from "axios";
import ClientList from "@/components/Client/ClientList.vue";
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap.js"
import AddClient from "@/components/Client/AddClient.vue";
import LogInClient from "@/components/Client/LogInClient.vue";
import {requireAuth} from "@/services/authGuard";
import ClientOrderList from "@/components/Client/ClientOrderList.vue";
import ProductOrderList from "@/components/Order/ProductOrderList.vue";
import UpdateOrder from "@/components/Order/UpdateOrder.vue";
import ProductList from "@/components/Product/ProductList.vue";
import SignUpClient from "@/components/Client/SignUpClient.vue";
import SupplierList from "@/components/ Supplier/SupplierList.vue";

// Create the Vue app instance
const app = createApp(App);

const apiURL = 'http://localhost:8080';

const axiosInstance = axios.create({
    apiURL,
});
app.config.globalProperties.$axios = axiosInstance;

// Create a router instance with history mode
const router = createRouter({
    history: createWebHistory(),
    routes: [
        {
            path: '/',
            name: 'Home-page',
            component: Home,
            beforeEnter:requireAuth,
        },
        {
            path: '/about',
            name: 'About-page',
            component: About,
        },
        {
            path: '/clients',
            name: 'Clients-page',
            component: ClientList,
        },
        {
            path: '/login',
            name: 'LoginClient-page',
            component: LogInClient,
        },
        {
            path: '/add-client',
            name: 'AddClient-page',
            component: AddClient,
        },
        {
            path: '/orders',
            name: 'Oredr-page',
            component: ClientOrderList,
            beforeEnter:requireAuth,
        },
        {
            path: '/products_order',
            name: 'ProductOrder-page',
            component: ProductOrderList,
            beforeEnter:requireAuth,
        },
        {
            path: '/updateorder',
            name: 'UpdateOrder-page',
            component: UpdateOrder,
            beforeEnter:requireAuth,
        },
        {
            path: '/products',
            name: 'ProductList-page',
            component: ProductList,
            beforeEnter:requireAuth,
        },
        {
            path: '/signup',
            name: 'SignupClient-page',
            component: SignUpClient,
        },{
            path: '/suppliers',
            name: 'SupplierList-page',
            component: SupplierList,
        },

        // Add more routes as needed
    ],
});

// Mount the router to the app
app.use(router);

// Mount the app to an HTML element with the id 'app'
app.mount('#app');

//