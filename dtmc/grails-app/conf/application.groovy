

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.dt.dtmc.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.dt.dtmc.UserRole'
grails.plugin.springsecurity.authority.className = 'com.dt.dtmc.Role'

grails.plugin.springsecurity.logout.postOnly = false
grails.plugin.springsecurity.userLookup.usernamePropertyName = 'emailId'
grails.plugin.springsecurity.userLookup.accountLockedPropertyName = 'isLocked'
grails.plugin.springsecurity.userLookup.passwordExpiredPropertyName = 'isPasswordExpired'

grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]




