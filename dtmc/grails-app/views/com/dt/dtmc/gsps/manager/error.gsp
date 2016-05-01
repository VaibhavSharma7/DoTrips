<!DOCTYPE html>
<html>
<head>
    <title>DTMC</title>
    %{--<meta name="layout" content="${gspLayout ?: 'main'}"/>--}%

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
<div class="login">
    <div class="container">
        <div class="row">
            <div class="col-md-12 text-center">
                <g:if test="${Throwable.isInstance(exception)}">
                    <dtmc:logAllExceptions exception="${exception}" />
                </g:if>
                <g:elseif test="${request.getAttribute('javax.servlet.error.exception')}">
                    <dtmc:logAllExceptions exception="${request.getAttribute('javax.servlet.error.exception')}" />
                </g:elseif>
                <div class="error-404">
                    <div class="text-center logo">
                        <asset:image src="dtmc-images/do-trips-logo.png"/>
                    </div>

                    <div class="404-container">
                        <span class="error-text">404</span>
                        <span class="page-not-found">Page not found</span>

                        <p class="sorry-message">We are sorry the page you are looking for doesn't exist.</p>

                        <div class="previous-page">
                            But the good news that you can still jump to the
                            <g:link controller="home" action="index">Home Page</g:link>
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