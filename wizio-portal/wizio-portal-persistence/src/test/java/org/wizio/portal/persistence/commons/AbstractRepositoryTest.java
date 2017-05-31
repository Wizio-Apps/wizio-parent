package org.wizio.portal.persistence.commons;

import static com.lordofthejars.nosqlunit.mongodb.MongoDbRule.MongoDbRuleBuilder.newMongoDbRule;

import org.junit.Rule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lordofthejars.nosqlunit.mongodb.MongoDbRule;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public abstract class AbstractRepositoryTest {
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Rule
    public MongoDbRule mongoDbRule = newMongoDbRule().defaultSpringMongoDb("mongolink");

}
