package dazhi.admin.config;

//@EnableWebSecurity
public class SecurityConfig{}
/*public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests(authorizeRequests ->
                        authorizeRequests
                                .antMatchers("/css/**", "/index").permitAll()
                                .antMatchers("/user/**").hasRole("USER")
                                .antMatchers("/**").permitAll()
        )
                .formLogin(formLogin ->
                        formLogin
                                .loginPage("/login")
                                .failureUrl("/login-error")
                );
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails userDetails = User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(userDetails);
    }
}*/
