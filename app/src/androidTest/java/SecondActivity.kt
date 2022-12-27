class SecondActivity : AppCompatActivity() {

    private lateinit var binding2: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding2.root)
        val intent = getIntent()

        binding2.result1.text = intent.getStringExtra("key").toString()
        binding2.result2.text = intent.getStringExtra("email").toString()
    }
}