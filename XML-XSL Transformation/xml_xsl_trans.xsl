<?xml version = "1.0" encoding = "UTF-8"?>
<xsl:stylesheet version = "1.0"   
xmlns:xsl = "http://www.w3.org/1999/XSL/Transform">
<xsl:template match = "/">
<html>
<body>
<h2>Player</h2>
<table border = "1">
<tr bgcolor = "orange">
<th>Name</th>
<th>Nation</th>
<th>Role</th>
<th>IPL</th>
</tr>
<!-- for-each processing instruction   
               Looks for each element matching the XPath expression   
               -->
<xsl:for-each select="customers/customer">
<tr>
<td><xsl:value-of select = "name"/></td>
<td><xsl:value-of select = "nation"/></td>
<td><xsl:value-of select = "role"/></td>
<td><xsl:value-of select = "ipl"/></td>
</tr>
</xsl:for-each>
</table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>
