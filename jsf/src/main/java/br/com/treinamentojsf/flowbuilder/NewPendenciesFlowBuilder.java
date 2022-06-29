package br.com.treinamentojsf.flowbuilder;

import java.io.Serializable;

import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;

public class NewPendenciesFlowBuilder implements Serializable {
	@Produces
	@FlowDefinition
	public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
		String flowId = "newpendencies";
		flowBuilder.id("", flowId);
		flowBuilder.viewNode(flowId, "/newdependencies/newdependencies.xhtml").markAsStartNode();
		flowBuilder.returnNode("proceedToNewRegistration3").fromOutcome("/newregistration/newregistration3.xhtml");
		flowBuilder.returnNode("exitToNewInicio").fromOutcome("/newregistration/newregistration.xhtml");
		flowBuilder.inboundParameter("userName", "#{testFlowBuilderNestedBean.userName}");
		flowBuilder.inboundParameter("userNickname", "#{testFlowBuilderNestedBean.userNickname}");
		return flowBuilder.getFlow();
	}

}
