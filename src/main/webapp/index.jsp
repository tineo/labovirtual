<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">   	
        <link href="./css/login.css" rel="stylesheet" type="text/css">
        <script src="js/bootstrap.min.js"></script>   
    </head>
    <body>
        <div class="row m-0 h-100 bg-auth">
            <div class="container">
                <div class="row h-100 padding-custom">
                    <div class="col-12 col-md-6 offset-md-6 background-login">
                        <div class="col-12 p-0 h-100 my-auto">
                            <div class="row h-100">
                                <div class="col-12 my-auto">
                                    <div class="content-right">
                                        <div class="row justify-content-center mb-5">
                                            <img class="logo-login" src="./assets/images/logo.png" alt="">
                                        </div>
                                        <div class="row justify-content-center">
                                            <div class="col-10 p-0">
                                                <div class="row justify-content-center">
                                                    <h4 class="login-text pl-2">
                                                        <strong>
                                                            SISTEMA DE LABORATORIO DE BIOLOGIA
                                                        </strong>
                                                    </h4>
                                                </div>
                                            </div>
                                        </div>
                                        <form class="login-form mt-4" autocomplete="off">
                                            <div class="row justify-content-center">
                                                <div class="col-9">
                                                    <div class="form-group">
                                                        <label for="user">Usuario</label>
                                                        <input type="text" class="form-control" id="user" placeholder="Ingresar usuario">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row justify-content-center">
                                                <div class="col-9">
                                                    <div class="form-group">
                                                        <label for="password">Contraseña:</label>
                                                        <input type="password" class="form-control" id="password" placeholder="Ingresar contraseña">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row mt-5">
                                                <div class="col-8 offset-2 p-0">
                                                    <div class="row w-100 m-0 justify-content-center">
                                                        <div class="col-7 col-lg-5">
                                                            <button type="button" class="btn btn-primary">INGRESAR</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
