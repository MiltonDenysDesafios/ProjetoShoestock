package br.sp.mdenys.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/java/br/sp/mdenys/features/",
glue = "",
tags = "@validar_produtos_carrinho"
)
public class Runner {

}
