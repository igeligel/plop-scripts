module.exports = (plop) => {
  plop.addHelper('resourceid', text => `{${text.toLowerCase()}Id}`);
  plop.setGenerator('Java EE - Service', {
    description: 'Create a new service',
    prompts: [{
      type: 'input',
      name: 'className',
      message: 'What is the entity class name of your service?',
    }, {
      type: 'input',
      name: 'packageName',
      message: 'What is the package name of your service?',
    }, {
      type: 'input',
      name: 'filePath',
      message: 'Where should the final file be at?',
    }],
    actions: [{
      type: 'add',
      path: '{{filePath}}/{{className}}Service.java',
      templateFile: 'templates/javaee/Service.java',
    }],
  });

  plop.setGenerator('Java EE - Resource', {
    description: 'Create a new resource',
    prompts: [{
      type: 'input',
      name: 'className',
      message: 'What is the entity class name of your resource?',
    }, {
      type: 'input',
      name: 'filePath',
      message: 'Where should the final file be at?',
    }],
    actions: [{
      type: 'add',
      path: '{{filePath}}/{{className}}Resource.java',
      templateFile: 'templates/javaee/Resource.java',
    }],
  });

  plop.setGenerator('Java EE - ServiceInterface', {
    description: 'Create a new service interface',
    prompts: [{
      type: 'input',
      name: 'className',
      message: 'What is the entity class name of your service interface?',
    }, {
      type: 'input',
      name: 'packageName',
      message: 'What is the package name of your service?',
    }, {
      type: 'input',
      name: 'filePath',
      message: 'Where should the final file be at?',
    }],
    actions: [{
      type: 'add',
      path: '{{filePath}}/{{className}}ServiceInterface.java',
      templateFile: 'templates/javaee/ServiceInterface.java',
    }],
  });

  plop.setGenerator('HTML - Minimal HTML5', {
    description: 'Create a new minimal HTML5 Template',
    prompts: [{
      type: 'input',
      name: 'title',
      message: 'What is the title of the HTML page',
    }, {
      type: 'input',
      name: 'fileName',
      message: 'File name?',
    }, {
      type: 'input',
      name: 'filePath',
      message: 'Where should the final file be at?',
    }],
    actions: [{
      type: 'add',
      path: '{{filePath}}/{{fileName}}.html',
      templateFile: 'templates/html/minimal-html5.html',
    }],
  });
};
