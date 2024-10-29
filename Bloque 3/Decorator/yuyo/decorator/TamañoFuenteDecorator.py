from FormatoDecorator import FormatoDecorator 

class TamañoFuenteDecorator:
    def _init_(self, editor, tamaño_fuente):
        super()._init_(editor)
        self.tamaño_fuente = tamaño_fuente

    def aplicar_formato(self):
        if self._editor.start_index and self._editor.end_index:
            self.editor.text_area.tag_add(f"tamaño{self.tamaño_fuente}", self._editor.start_index,self._editor.end_index)
            self.editor.text_area.tag_configure(f"tamaño{self.tamaño_fuente}",font={"Arial",self.tamaño_fuente})