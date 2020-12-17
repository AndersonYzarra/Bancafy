/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function errorlogin() {
    Swal.fire({
        title: 'Operación interrumpida',
        text: 'Nombre de usuario o contraseña incorrectos.',
        type: 'error',
        showCancelButton: false,
        allowOutsideClick: false
    }).then(
            function () {
                window.location.href = 'login.jsp';
            },
            function () {
                return false;
            });
}
function errorgenerico() {
    Swal.fire({
        title: 'Operación interrumpida',
        text: 'Ha ocurrido un error.',
        type: 'error',
        showCancelButton: false,
        allowOutsideClick: false
    }).then(
            function () {
                return false;
            });
}

function exitogenerico() {
    Swal.fire({
        title: 'Operación exitosa',
        icon: 'success',
        type: 'success',
        showConfirmButton: true,
        showCancelButton: false,
        allowOutsideClick: false
    }).then(
            function () {
                return false;
            });

}