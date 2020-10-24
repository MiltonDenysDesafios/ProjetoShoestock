package br.sp.mdenys.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/java/br/sp/mdenys/features/Shoestock.features",
glue = "",
tags = "@validar_produtos_carrinho"
)
public class Runner {

}
