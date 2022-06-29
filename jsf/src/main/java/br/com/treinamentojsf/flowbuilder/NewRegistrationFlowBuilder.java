package br.com.treinamentojsf.flowbuilder;

import java.io.Serializable;

import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;

public class NewRegistrationFlowBuilder implements Serializable {
	@Produces
	@FlowDefinition
	public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
		String flowId = "newregistration";
		flowBuilder.id("", flowId);
		flowBuilder.viewNode(flowId, "newregistration/newregistration.xhtml").markAsStartNode();
		flowBuilder.viewNode(flowId, "newregistration/newregistration2.xhtml");
		flowBuilder.viewNode(flowId, "newregistration/newregistration3.xhtml");
		flowBuilder.switchNode("newRegistrationPage2").defaultOutcome(flowId).switchCase()
				.condition("#{if not empty testFlowBean.nome and not empty testFlowBean.sobrenome}")
				.fromOutcome("newregistration2");
		flowBuilder.flowCallNode("callNewPendencies").flowReference("", "newpendencies")
				.outboundParameter("userName", "#{testFlowBuilderNestedBean.userName}")
				.outboundParameter("userNickname", "#{testFlowBuilderNestedBean.userName}");
		flowBuilder.returnNode("exitToInicio").fromOutcome("inicioflow.xhtml");
		flowBuilder.returnNode("exitToIndex").fromOutcome("index.xhtml");
		flowBuilder.finalizer("#{testFlowBuilderBean.salvar}");
		return flowBuilder.getFlow();
	}

}
