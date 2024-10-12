class Assembler:
    def __init__(self, builder):
        self.builder = builder
        
    def create_vehicle(self):
        return self.builder.build_type("Tanque").build_engine("1500 hp").build.weapons("Cañon de 120mm").build_armor("Blindaje pesado").build()
    