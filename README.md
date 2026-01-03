# Section 9: Appendix Introduction to Spring Framework in 10 Steps

## 194*:

    - @Component
    - @AutoRewrite 
    - using spring boot create.bean to create an instance of a class

## 195:

    - Enabling debugger in the logging
    - Only one component should be declared in order to spring create a bean

## 196:

    - A component is a class managed by spring
    - Spring FW finds a component by searcing the @component tags
    in the current package
    - IOC: Inversion of control. Means the spring FW is in control not the developer.

## 198:

    - Making a bean primary by adding @Primary annotation

## 199:

    - Maven manages all the dependencies in the java project
    - Using pom.xml the dependency can be changed

## 200: types of spring dependencies

    - constrator-based: in GameRunner class
    - Field based: In the MyWebController using @Autowire
    - Setter dependency: In Business service using setter for DataService
    - Its recommended to use Constrator-Based so all the dependencies can be available just by creating the obj

## 17: Rest API Controller GET

    - Set up hello word end point 

## 19: Return JSON

    - Return bean class as JSON format from controller

## 20:

    - Dispatcher Servlet: handles all API request. This is the first place any request hits.
      as this is mapped to root '/' url.
    - Auto configuration manages the dispatcher servlet.
    - A bean (ex: hello-world-bean) is getting converted to JSON by
      @ResponseBody and JacksonHttpMessageConverter
      it's also done by auto configuration.

## 21: path variable
    - passing variable using query string

## 26: POST with @RequestBody
    - Sending JSON usng @RequestBody
    - Creating a new user with POST
## 27: sending new user location
    - Send newly created user's uri after saving it

## 29: Custom error with appropiate code
    - Handling cusom error with appropiate code
## 31: ResponseEntityExceptionHandler 
    - override ResponseEntityExceptionHandler to customize error handeling

## 33: Validation jakarta validation
    - validate and send appropiate response using jakarta validation
## 37: Swagger open api
    - Install swagger open api
    - Get the details of api endpoints
    - get the json documentation of apis

## 39: Internationalization
    - receiving data in different languages
    
## 41: Versioning using query string
 	- Different response based on the different version in query string.
 	
## 42: Versioning
 	- URI versioning. "person/V2/somethingelse
 	- Query param: "person?version=1"
 	- Headers: passing version number as using header "X-API-VERSION"
 	- Media type: passing version number as Accept through "application/				vnd.company.app-v2+json"
 	
## 43: adding link using HATEOAS
	- Adding Links in an API response using library HATEOAS
	
## 44: Serialization, static
	- Change the property name of response. name to user_name
	- static filtering: apply to all the instance of a class
	
## 45: dynamic filtering
	- filter fields based on the end point you hit
	- spring boot 3> doesn't support MappingJacsonValue, need to use Map and Hashmap
	
## 46: Actuator
	- actuator. app health, endpoints, http request details etc
	