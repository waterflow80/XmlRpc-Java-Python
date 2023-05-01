import xmlrpc.client


url = "http://localhost:8084/"


with xmlrpc.client.ServerProxy(url) as proxy:

  
  # Initialize the 'Annuaire'
  print("---------------------------------")
  print("****Initialize the 'Annuaire'****")
  res = proxy.ANN.init()
  print("Init = ", res)
  
  # Adding 4 contacts
  print("---------------------------------")
  print("***Adding 4 contacts***")
  
  proxy.ANN.ajouterEntree("james", "54875421")
  proxy.ANN.ajouterEntree("mariem", "25487569")
  proxy.ANN.ajouterEntree("sousou", "98548741")
  proxy.ANN.ajouterEntree("mimi", "75846841")
  print("Adding a new contact: {'name' : 'james', 'numTel' : '54875421'}")
  print("Adding a new contact: {'name' : 'mariem', 'numTel' : '25487569'}")
  print("Adding a new contact: {'name' : 'sousou', 'numTel' : '98548741'}")
  print("Adding a new contact: {'name' : 'mimi', 'numTel' : '75846841'}",end="")
  
  # Search for a contact's phone by its name
  print("\n---------------------------------")
  print("***Search for a contact's phone by its name***")
  name = "sousou"
  numero = proxy.ANN.trouverNumero("sousou")
  print("Sousou --> [NumTel=",numero + "]")
  print("---------------------------------\n")
  
  # Get the number of all contacts
  print("***Get NbNumeros***")
  nbContacts = proxy.ANN.nbNumeros()
  print("The number of contacts: ", nbContacts)
  print("---------------------------------\n")

  # List Methods
  methods = proxy.ANN.listMethods()
  print("List of methods:\n",methods)
  
  # Get all
  allContacts = proxy.ANN.getAll();
  print("All contacts :", allContacts)
  
  #print("The sum 1 + 6 = %s" %str(proxy.sum(1, 6)) )