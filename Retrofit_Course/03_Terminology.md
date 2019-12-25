## Common terminology
This lesson covers some basic terminology that we will be working until the end of our course such as Retrofit, API and JSON. 

### Retrofit
It's an HTTP client for Android and Java. Take for granted this statement as a library which contains a cohesive collection of tools for working with HTTP calls. So Retrofit will act as an external library within our project in order to make HTTP calls. This course focus more on the __GET__ method, but as you acquire experience with Retrofit and APIs we hope that you start to explore more other HTTP methods.

### API
Acronym for Application Program Interface, think for it as some kind of program developed in a way to help us get the content of an already existent application. So the information within the API is designed in such a way that it gives us the tool to use that info within our external application. APIs can be public or private like [clouds](https://www.investopedia.com/terms/c/cloud-computing.asp) and the data that is provided by the API can be in two basic formats: JSON and XML. As XML is an obsolete data structure still used in legacy systems, but we will focus on JSON.

### JSON
Acronym for JavaScript Object Notation, visit [this site](http://jsonviewer.stack.hu/) and *copy - paste* the JSON variable below to understand how each data type is represented on JSON as key and value pairs separated by `:` and `,`. Here `users` are an Array of Objects.
```json
{
  "Title": "Show me a JSON",
  "Language": "Java",
  "users": [
    {
	  "name": "Peter",
	  "age": 29
	},
	{
	  "name": "Mary",
	  "age": 31
	},
	{
	  "name": "Antony",
	  "age": 18
	}
  ]
}
```