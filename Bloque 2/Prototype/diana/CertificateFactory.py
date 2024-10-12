class CertificateFactory:
    def __init__(self):
        self.certicate_prototypes = {}
    
    def add_prototype(self, key, certificate):
        self.certicate_prototypes[key] = certificate
        
    def create_certificate(self, key):
        return self.certicate_prototypes[key].clone()
    
