export function requireAuth(to, from, next) {
    const clientData = localStorage.getItem('client');

    if (!clientData) {
        next('/login');
    } else {
        next();
    }
}