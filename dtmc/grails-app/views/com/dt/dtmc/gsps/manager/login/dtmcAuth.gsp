<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="${gspLayout ?: 'main'}"/>
    <dtmc:removePreviousPageCache/>
</head>
<body>
<div class="login">
    <div class="container">
    <div class="row">
        <div class="col-md-12 text-center">
            <div class="login-panel">
                <div class="text-center logo">
                    <asset:image src="dtmc-images/do-trips-logo.png"/>
                </div>

                <form action="${postUrl ?: '/login/authenticate'}" method="POST" id="loginForm" class="cssform"
                      autocomplete="off">
                    <g:if test='${flash.message}'>
                        <div class='login-error-message'>${flash.message}</div>
                    </g:if>

                    <fieldset>
                        <div class="form-group">
                            <input class="form-control" placeholder="Username" name="${usernameParameter ?: 'username'}"
                                   id="username" type="text" autofocus="">
                        </div>

                        <div class="form-group">
                            <input type="password" class="form-control" placeholder="Password"
                                   name="${passwordParameter ?: 'password'}" id="password">
                        </div>

                        <div class="form-group">

                            <input type="submit" id="submit" value="Log In"
                                   class="btn btn-lg btn-block login-button"/>
                        </div>

                        <div class="form-group text-center">
                            <g:link controller="login" action="forgotPassword"
                                    class="white-anchor"><g:message
                                    code="forgot.password.text"/></g:link>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</div>
</div>
</body>
</html>