<!DOCTYPE html>
<html>
    <head>
    <title>DTMC</title>
    %{--<meta name="layout" content="${gspLayout ?: 'dtmcMain'}"/>--}%
    <asset:image src="dtmc-images/favicon.ico"/>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width; initial-scale=1.0;"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <asset:stylesheet src="dtmc-stylesheets/style.css"/>
</head>
<body class="login">
<div class="container">
    <div class="row">
        <div class="col-md-12 text-center">
            <div class="login-panel">
                <div class="text-center logo">
                    <asset:image src="dtmc-images/do-trips-logo.png"/>
                </div>
                <form role="form">
                    <fieldset>
                        <div class="form-group">
                            <g:link class="cancel-btn" controller="home" action="index"><< Return to Log In</g:link>
                        </div>
                        <div class="form-group">
                            <input class="form-control" placeholder="Username" name="username" type="text" autofocus="">
                        </div>
                        <div class="form-group">
                            <button class="btn btn-primary blue-color get-password" type="submit">Reset Password</button>
                        </div>

                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>