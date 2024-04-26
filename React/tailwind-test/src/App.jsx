import Header from "./components/Header";
import Lista from "./components/Lista";
import LoginForm from "./components/Login";

function App() {

  return (
    <>

      <body body className="bg-black h-screen">
        <Header />
        <div className="flex justify-center text-center">
          <LoginForm />
        </div>
      </body>
    </>
  )
}

export default App
