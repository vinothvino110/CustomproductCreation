<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.json.JSON"%>
<%@ include file="/init.jsp" %>


<p>
	<b><liferay-ui:message key="productscreation.caption"/></b>
</p>

<portlet:actionURL  var="formsub" name="formsubmit">
</portlet:actionURL>

<!-- <portlet:renderURL var="addredirectURL">
        <portlet:param name="mvcPath" value="/Test01.jsp" />
      </portlet:renderURL>
<button name="Redirect" value=addredirectURL>Redirect</button>
 -->
hello!!!!!!!!
<form action="<%=formsub%>" name="fm" method="POST" >
ID : <input type="text" name="<portlet:namespace/>cupid" id="<portlet:namespace/>cupidid"> </br> </br>
Product Name : <input type="text" name="<portlet:namespace/>pname" id="<portlet:namespace/>pid"/></br>
Product Type : <input type="text" id="<portlet:namespace/>ptype" name="<portlet:namespace/>ptype"> </br>
Product price : <input type="text" id="<portlet:namespace/>pprice" name="<portlet:namespace/>pprice"> </br>
Product Brand : <input type="text" id="<portlet:namespace/>pbrand" name="<portlet:namespace/>pbrand"> </br>
<input type="submit"  value="SUBMIT"/>
</form>

<%
out.println(request.getAttribute("data"));
Object datajsp=request.getAttribute("data");
%>

<div style="border-radius: 10px; background: beige; padding: 10px; height : 110px; width:150px;">
  Product Details:::
  <%=ParamUtil.getString(request,"pname") %>
  <%=ParamUtil.getString(request,"pprice") %>
  
</div>


