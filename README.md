# BookFlow

Welcome to BookFlow, a comprehensive library application built using Quarkus, the Supersonic Subatomic Java Framework!

## Description

Excited to announce that I've embarked on a hobby project called BookFlow, where I'll be diving into the world of Quarkus! 🚀📚 As someone who is new to Quarkus, I'm eager to explore its capabilities. The project is in its early stages, and I'm aiming to build a comprehensive library application, covering everything from basic book management  to advanced features like ordering and online rentals.

My goal with this project is to create a well-structured reference work that can serve as a helpful resource for anyone interested in diving into Quarkus projects in the future. I'm excited to learn and grow throughout this journey, and I'll be sharing my progress and insights on GitHub.

If you're interested in Quarkus or simply want to follow along and provide support, I'd be thrilled to have you join me. Stay tuned for updates!

## Modules

BookFlow consists of the following modules:

- **bookflow**: The main project module, which encompasses the entire BookFlow application.
- **bookflow-common**: The common module where entities and shared functionalities reside.
- **bookflow-library**: The library module that contains all the business logic for the BookFlow application. It runs on port 8082.

## Prerequisites

To run the project, ensure that you have the following installed:

- Apache Maven 3.8+ (https://maven.apache.org)
- Java Development Kit (JDK) 17

## Installation

1. Clone the repository: `git clone https://github.com/mezeimate/bookflow-backend`
2. Navigate to the project directory: `cd bookflow-backend`

### Create docker containers
#### Mariadb and phpmyadmin:
- `cd .\bookflow-liquibase\src\main\resources\schema\`
- `docker-compose up`

#### Create database tables and add rows
- `cd .\bookflow-liquibase\src\main\resources\db\`
- `docker-compose up`

phpmyadmin: `http://localhost:8080`

### Run application

To build the project without starting the modules, use the following command: `mvn clean install`

To run the application, execute the following commands for each module:
- `cd .\bookflow-library\`
- `mvn quarkus:dev`

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

Access the application at [http://localhost:8082](http://localhost:8082) for the BookFlow library module.

## Contributing

Contributions are welcome! If you'd like to contribute to the project, please follow these steps:

1. Fork the repository.
2. Create a new branch: `git checkout -b feature/my-feature`
3. Make your changes and commit them: `git commit -am 'Add some feature'`
4. Push the branch to your forked repository: `git push origin feature/my-feature`
5. Submit a pull request to the main repository.

## License

This project is licensed under the [Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International (CC BY-NC-SA 4.0)](https://creativecommons.org/licenses/by-nc-sa/4.0/legalcode) License. Please see the [LICENSE.md](LICENSE.md) file for more details.

## Contact

If you have any questions or suggestions regarding the project, feel free to reach out to me. You can find my contact information on my [LinkedIn profile](https://www.linkedin.com/in/mezei-mate/).

Enjoy using BookFlow!