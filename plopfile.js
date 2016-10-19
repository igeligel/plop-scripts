module.exports = (plop) => {
  // Here we'll define our generators
  // We declare a new generator called "module"
  plop.setGenerator("module", {

    // Succintly describes what generator does.
    description: "Create a new service",

    // Get inputs from the user.
    // That's Inquirer.js doing the job behind the hood.
    prompts: [{
      type: "input",
      name: "className",
      message: "What is the entity class name of your service?"
    }, {
      type: "input",
      name: "packageName",
      message: "What is the package name of your service?"
    }, {
      type: "input",
      name: "filePath",
      message: "Where should it be moved?"
    }],

    // List of actions to take.
    // Here we "add" new files from our templates.
    actions: [{
      type: "add",
      path: "{{filePath}}" + "/{{className}}Service.java",
      templateFile: "templates/javaee/Service.java"
    }]
  });
};
