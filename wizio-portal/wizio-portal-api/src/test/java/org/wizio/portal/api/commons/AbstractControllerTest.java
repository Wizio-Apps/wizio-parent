package org.wizio.portal.api.commons;

import static com.lordofthejars.nosqlunit.mongodb.MongoDbRule.MongoDbRuleBuilder.newMongoDbRule;
import static org.junit.Assert.assertFalse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import com.lordofthejars.nosqlunit.mongodb.MongoDbRule;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml", "/WEB-INF/spring/applicationServlet.xml"})
@WebAppConfiguration
public abstract class AbstractControllerTest {
	
	private static final String JSON_CONTENT_TYPE = "application/json";
	protected static final String GET_HTTP_METHOD = "GET";
	protected static final String POST_HTTP_METHOD = "POST";
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Rule
    public MongoDbRule mongoDbRule = newMongoDbRule().defaultSpringMongoDb("mongolink");

    @Autowired
    protected RequestMappingHandlerAdapter handlerAdapter;

    @Autowired
    protected RequestMappingHandlerMapping handlerMapping;

    protected MockMvc mockMvc;
    protected MockHttpServletRequest request;
    protected MockHttpServletResponse response;
    protected MockHttpSession session;

    @Before
    public void setUp() {
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
        session = new MockHttpSession();
    }
    
    protected void testJsonArrayRoute(String route, String method) throws Exception {
        request.setRequestURI(route);
        request.setMethod(method);
        request.setContentType(JSON_CONTENT_TYPE);
        Object handler = handlerMapping.getHandler(request).getHandler();
        handlerAdapter.handle(request, response, handler);
        JSONArray jsonArray = (JSONArray) new JSONParser().parse(response.getContentAsString());
        System.out.println(jsonArray);
        assertFalse(jsonArray.isEmpty());
    }
    
    protected void testJsonObjectRoute(String route, String method) throws Exception {
        request.setRequestURI(route);
        request.setMethod(method);
        request.setContentType(JSON_CONTENT_TYPE);
        Object handler = handlerMapping.getHandler(request).getHandler();
        handlerAdapter.handle(request, response, handler);
        JSONObject jsonObject = (JSONObject) new JSONParser().parse(response.getContentAsString());
        System.out.println(jsonObject);
        assertFalse(jsonObject.isEmpty());
    }

}
