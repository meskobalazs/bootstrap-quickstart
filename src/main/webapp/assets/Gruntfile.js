module.exports = function(grunt) {

    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),
        gruntMavenProperties: grunt.file.readJSON('grunt-maven.json'),
		clean: ['target-grunt'],
        mavenPrepare: {
            options: {
                resources: ['**']
            },
            dev: {}
        },
        mavenDist: {
            options: {
                warName: 'ROOT',
                deliverables: ["dist/**.min.js", "!dist/js/test/**"]
            },
            dev: {}
        },
        watch: {
            files: ["<%= gruntMavenProperties.filesToWatch %>"],
            tasks: ['default']
        }
    });

	grunt.loadNpmTasks('grunt-contrib-clean');
    grunt.loadNpmTasks('grunt-maven');
    grunt.loadNpmTasks('grunt-contrib-watch');

    grunt.registerTask('default', ['mavenPrepare', 'mavenDist']);
};