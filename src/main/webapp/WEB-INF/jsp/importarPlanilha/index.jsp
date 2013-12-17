<jsp:include page="/cabecalho.jsp"></jsp:include>

<div class="panel panel-default">
  <div class="panel-heading">Importar Planilha</div>
  <div class="panel-body">
   
   <form>
   <div class="form-group">
    <label class="quebra" for="Ano">Ano</label><input type="text" name="Ano" id="Ano" class="form-control tamanho"></div>
    
    <div class="form-group">
    <label class="quebra" for="Semestre">Semestre</label><input type="text" name="Semestre" id="Semestre" class="form-control tamanho"></div>
    
    
    Planilha
    <label class="quebra"><input type="text" name="Planilha" id="Planilha" class="input"></label>
    <input type="file" id="exampleInputFile">
    
  </form>
    
  </div>
</div>



<jsp:include page="/rodape.jsp"></jsp:include>