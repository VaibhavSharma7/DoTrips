<!doctype html>
<html lang="en" class="no-js">
<head>
    <title>
        <g:message code="title.text"/>
    </title>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width; initial-scale=1.0;"/>
    <asset:stylesheet src="dtmc-stylesheets/style.css"/>
    <asset:stylesheet src="dtmc-stylesheets/bootstrap.min.css"/>
    <link rel="shortcut icon" href="/assets/dtmc-images/favicon.ico">
    <asset:javascript src="application.js"/>
</head>

<body>

<g:if test="${statusCode != 500}">
%{--Main Header Starts--}%
    <sec:ifLoggedIn>
    %{--Any user is logged in--}%
        <sec:ifAllGranted roles="ROLE_ADMIN">%{--Or <sec:ifAnyGranted roles="ROLE_ADMIN, ROLE_SUPER_ADMIN"> --}%
        %{--For all roles Granted--}%
            <nav class="navbar navbar-fixed-top">
                <a class="navbar-brand" href="">
                    <asset:image src="dtmc-images/do-trips-logo.png" class="header-logo"></asset:image>
                </a>

                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                                data-target="#navbar"
                                aria-expanded="false" aria-controls="navbar">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>

                    <div id="navbar" class="navbar-collapse collapse">
                        <ul class="nav navbar-nav navbar-left">
                            <li class="active"><a href="#">DT Setup</a></li>
                            <li><a href="#about">DT Config</a></li>
                            <li class="dropdown">
                                <a href="#contact" class="dropdown-toggle" data-toggle="dropdown" role="button"
                                   aria-haspopup="true" aria-expanded="false">URM <span class="caret"></span></a>
                            </a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Action</a></li>
                                    <li><a href="#">Another action</a></li>
                                    <li><a href="#">Something else here</a></li>
                                    <li class="dropdown-header">Nav header</li>
                                    <li><a href="#">Separated link</a></li>
                                    <li><a href="#">One more separated link</a></li>
                                </ul>
                            </li>
                        </ul>
                        <ul class="nav navbar-nav navbar-right">
                            <li class="active welcome-user"><a href=""><g:message
                                    code="welcome.text"/> <dtmc:loggedInUserFirstName/> |</a></li>
                            <li class="active logout"><g:link controller="logout" action="index"><g:message
                                    code="logout.button.label"/></g:link></li>
                        </ul>
                    </div><!--/.nav-collapse -->
                </div>
            </nav>
        </sec:ifAllGranted>
    </sec:ifLoggedIn>
%{--Main Header Ends--}%
</g:if>

<dtmc:flashMessage flashMessage="${flash.message}"/>

<g:layoutBody></g:layoutBody>

<g:if test="${statusCode != 500}">
    <sec:ifLoggedIn>
    %{--DTMC Footer Starts--}%
        <footer class="footer">
            <div class="container">
                <p><g:message code="copyright.text"/></p>
            </div>
        </footer>
    %{--DTMC Footer Ends--}%
    </sec:ifLoggedIn>
</g:if>

<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

</body>
</html>