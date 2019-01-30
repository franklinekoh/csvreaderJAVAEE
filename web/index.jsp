<%-- 
    Document   : index
    Created on : Oct 17, 2017, 11:48:56 AM
    Author     : FRANK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Cellulant - life is mobile</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">

        <meta name="viewport"  />
        <!-- Latest compiled and minified CSS for bootstrap-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="assets/fa/css/font-awesome.css">
        <!--Custom css links-->
        <link rel="stylesheet" href="assets/css/custom.css">
        <link rel="stylesheet" href="assets/css/component.css">
        <title>Cellulant - life is mobile</title>
        <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:400,500,700,300">
    </head>
    <body class="body">
        <div class="container-fluid" style="background-color: #ffffff">
            <div class="row">
                <!--nav start-->
                <nav class="navbar navbar-default" role="navigation" style="background: #ffffff; border: 0px !important;">
                    <div class="container-fluid">
                        <div class="navbar-header">

                            <a class="navbar-brand" href="#" id="brand"><img src="assets/images/logo.png" style="height: 30px;"></a>
                        </div>

                    </div>
                </nav>
            </div>
            <!--nav end-->
        </div>
        <!--Main content-->
        <div class="main">
            <h1>Restricted Access!</h1>
            <%String msg = (String) request.getAttribute("msg");%> 
            
              <%if (msg != null) {%> 
            <div  class="alert alert-success">
                <button type="button" class="close" data-dismiss ="alert" aria-hidden="true">&times;</button>
                ${msg}
            </div>
            <% }%>
            <h2 style="color:#00d5ea; margin-left: 30px;">Upload XLS file</h2>

            <div class=" col-md-12">
                <div class="panel panel-default">
                    <div class="panel-heading"><i class="fa fa-balance-scale fa-2x" style="margin-right: 410px;"></i></div>
                    <div class="panel-body">
                        <form method="post" action="uploadCsv" enctype="multipart/form-data">
                            <div class="form-group box js">
                                <label class="btn btn-default btn-sm center-block btn-file">
                                    <i class="fa fa-upload fa-4x" aria-hidden="true"></i>
                                    <input type="file" name="name" value="" required="">

                                </label>
                                <button type="submit" id="balancesubmit" class="btn-group btn btn-default ">Submit</button>
                            </div>
                        </form>
                    </div>
                </div>

            </div>

            <!--    <div class="checkbalancepanel col-md-5">
                    <div class="panel panel-default">
                        <div class="panel-heading"><i class="fa fa-cogs fa-2x" style="margin-left: 470px;"></i></div>
                        <div class="panel-body">
                            <form method="post" action="" enctype="multipart/form-data">
                                <div class="form-group box js" >
            
                                    <label class="btn btn-default btn-sm center-block btn-file">
                                        <i class="fa fa-upload fa-4x" aria-hidden="true"></i>
                                        <input type="file" name="reset_document" style="" required>
                                    </label>
                                    <button type="submit" id="pinsubmit" class="btn-group btn btn-default ">Submit</button>
                                </div>
                            </form>
                        </div>
                    </div>
            
                </div>-->
            <!--<vr />-->

        </div>

        <!--end of main content-->
        <section>
            <footer id="footer">
                <div class="row " style="margin-left: 150px; margin-right: 150px; font-size: 12px;" >
                    <div class="col-md-2">
                        <a href=""><img src="assets/images/inspired.png" style="margin-top: 32px; margin-left: 20px; margin-bottom: 20px; height: 30px; width: 130px;" ></a>
                    </div>
                    <div class="col-md-8" >
                        <p style="margin-left: 60px; margin-top: 25px; "> &copy; 2017 Cellulant Nigeria Limited. All Rights Reserved | <a href="https://www.tingg.com.ng/privacy-policy.jsp"> Privacy Policy</a> | <a href="https://www.tingg.com.ng/code-of-practice.jsp"> Code of practice</a></p>
                        <p style="font-size: 10px; margin-left: 25px; color: #00d5ea">Cellulant is wallet licenced and regulated by central bank of Nigeria(CBN) to provide mobile payment service</p>
                    </div>
                    <div class="col-md-2">
                        <a href="https://play.google.com/store/apps/details?id=com.cellulant.wallet"><img src="assets/images/googleplay.png" style="height: 100px; width: 120px"></a>
                    </div>
                </div>
            </footer>
        </section>

    </body>
</html>
