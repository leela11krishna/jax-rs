Sample webapp-runner app
	Using Git
		$ mvn clean install
		$ heroku local
		$ heroku create
		$ git push heroku master
	Using the CLI(We used this)
		Open Command prompt and run the following commands
		$ mvn clean install
		$ heroku plugins:install heroku-cli-deploy
		$ heroku war:run target/rest-0.0.1-SNAPSHOT.war -a rest
		Open new Command prompt and run the following commands
		$ heroku create
		$ heroku war:deploy target/rest-0.0.1-SNAPSHOT.war -a warm-meadow-22068 
		
Note: warm-meadow-22068 is the app create from heroku create command

Then go to the URL https://warm-meadow-22068.herokuapp.com/service where we can access our services.