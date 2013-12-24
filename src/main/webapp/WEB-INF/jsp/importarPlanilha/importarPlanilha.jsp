<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
<c:when test="${respostaImportService == 'SUCESSO'}">
	<div class='alert alert-success'>Planilha importada com sucesso</div>
</c:when>
<c:when test="${respostaImportService == 'ARQUIVO_VAZIO'}">
	<div class='alert alert-warning'>A planilha enviada está vazia</div>
</c:when>
<c:when test="${respostaImportService == 'ARQUIVO_FORMATO_INVALIDO'}">
	<div class='alert alert-danger'>O arquivo enviado não é uma planilha nos formatos XLS ou XLSX.</div>
</c:when>
<c:when test="${respostaImportService == 'ARQUIVO_ESTRUTURA_INVALIDA'}">
	<div class='alert alert-danger'>A estrutura da planilha enviada não é válida</div>
</c:when>
<c:otherwise>
    <div class='alert alert-danger'>ERRO DESCONHECIDO</div>
</c:otherwise>
</c:choose>