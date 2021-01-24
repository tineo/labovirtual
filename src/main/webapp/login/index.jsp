<%-- 
    Document   : index
    Created on : 23/01/2021, 09:58:36 PM
    Author     : GERSON
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<html>
    <head>
        <title>Title</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">   	
        <link href="./css/login.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
        
        <script src="./js/jquery.min.js"></script>
        <script src="./js/bootstrap.min.js"></script>   
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
                                                        <label for="user"><i class="fas fa-user mr-2 mt-1 ic-form"></i>Usuario:</label>
                                                        <input type="text" class="form-control" id="user" placeholder="Ingresar usuario">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row justify-content-center">
                                                <div class="col-9">
                                                    <div class="form-group">
                                                        <label for="password"><i class="fas fa-lock mr-2 mt-1 ic-form"></i>Contraseña:</label>
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
