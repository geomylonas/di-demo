package georgemylonas.didemo.config;

import georgemylonas.didemo.examplebeans.FakeDataSource;
import georgemylonas.didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration

public class PropertyConfig {

    @Autowired
    org.springframework.core.env.Environment env;


    @Value("${georgemylonas.username}")
    String username;

    @Value("${georgemylonas.password}")
    String password;

    @Value("${georgemylonas.dburl}")
    String url;

    @Value("${jms.username}")
    String jmsusername;

    @Value("${jms.password}")
    String jmspassword;

    @Value("${jms.dburl")
    String jmsurl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource=new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }
    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker=new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsusername);
        fakeJmsBroker.setPassword(jmspassword);
        fakeJmsBroker.setUrl(jmsurl);
        return fakeJmsBroker;
    }







}
