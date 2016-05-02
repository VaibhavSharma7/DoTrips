<!DOCTYPE html>
<html lang="en">
<head>
    <title><g:message
            code="title.text"/></title>
    <meta name="layout" content="${gspLayout ?: 'main'}"/>
</head>

<body>

<div class="container-fluid parent-container">
    <div class="row">
        <h3 class="text-center dtmc-header"><g:message code="dashboard.heading.text"/></h3>
        <g:link controller="home" action="simpleUser">Simple User</g:link>


        <g:message code="title.text.core"/>

        <form class="admin-home-page">
            <ul class="application-services">
                <li class="image-block">
                    <a>
                        <asset:image src="dtmc-images/hotel.png" class="header-logo"></asset:image>
                        <p>Hotel Manager</p>
                    </a>
                </li>
                <li class="image-block">
                    <a>
                        <asset:image src="dtmc-images/experience.png" class="header-logo"></asset:image>
                        <p>Experience Manager</p>
                    </a>
                </li>
                <li class="image-block">
                    <a>
                        <asset:image src="dtmc-images/packages.png" class="header-logo"></asset:image>
                        <p>Package Manager</p>
                    </a>
                </li>
                <li class="image-block">
                    <a>
                        <asset:image src="dtmc-images/common-manager%20copy.png" class="header-logo"></asset:image>
                        <p>Common Manager</p>
                    </a>
                </li>
                <li class="image-block">
                    <a>
                        <asset:image src="dtmc-images/info.png" class="header-logo"></asset:image>
                        <p>DT  Information System</p>
                    </a>
                </li>
                <li class="image-block">
                    <g:link controller="home" action="adminUser">
                        <asset:image src="dtmc-images/burj-khalifa.jpg" class="header-logo"></asset:image>
                        <p>DT Recon System</p>
                    </g:link>
                </li>
            </ul>

            <div class="admin-details">
                <span>Welcome User
                    <span class="image-section">

                    </span>
                </span>
                <ul>
                    <li><strong>Your Role:</strong> Admin <dtmc:loggedInUserFirstName/></li>
                    <li><strong>Last Login:</strong> 1 Apr 2016</li>
                    <li><strong>Last Password Reset Date:</strong> 1 Apr 2016</li>
                    <li><a href="#">Link to access logs</a></li>
                </ul>
            </div>

        </form>
    </div>
</div>

<script>
    //Login screen : Disable browser back button once logged out.
    $(document).ready(function(){
        history.pushState(null, null, "/");
        window.addEventListener('popstate', function () {
            history.pushState(null, null, "/");
        });
    });
</script>
</body>
</html>